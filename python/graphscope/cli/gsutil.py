import os
import sys
import click
import subprocess

class GSUtil(object):
    """ GraphScope command-line utility
    
    This is a context for the utility.
    """
    def __init__(self, home=None, debug=False):
        self.home = os.path.abspath(home or '.')
        self.debug = debug


@click.group()
@click.option('--repo-home', envvar='REPO_HOME', default='.', help="GraphScope code repo location.")
@click.pass_context
def cli(ctx, repo_home):
    ctx.obj = GSUtil(repo_home)


@click.command()
@click.argument("component", type=click.Choice(['interactive', 'analytical', 'learning', 'coordinator', 'client'], case_sensitive=False), required=False)
@click.option("--install", is_flag=True, default=False, help="Flag indicating whether install after built binaries.")
@click.option("--install-prefix", type=click.Path(), default="/opt/graphscope", show_default=True, help="Install built binaries to customized location.")
@click.option("--with-java", is_flag=True, default=False, help="Whether build analytical engine with Java support.")
@click.option("--storage-type", type=click.Choice(['experimental', 'vineyard'], case_sensitive=False), help="Make gie with specified storage type.")
@click.pass_obj
def make(repo, component, install, install_prefix, storage_type, with_java):
    """Build executive binaries of COMPONENT. If not given a specific component, build all.

       \f
       TODO: maybe without make?
    """
    click.secho("Begin the make command, to build components of GraphScope.", fg="green")
    click.echo(f"repo home = {repo.home}")
    click.echo(f'make command,{component}')
    cmd = []
    workingdir = repo.home
    if component == "interactive":
        click.secho("Building interactive engine.", fg="green")
        if storage_type == "experimental":
            cmd = ['make', 'build', 'QUIET_OPT=""']
            workingdir = os.path.join(repo.home, "interactive_engine", "compiler")      
        if storage_type == "vineyard":
            cmd = ['mvn', 'install', '-DskipTests', '-Drust.compile.mode=release', '-P', 'graphscope,graphscope-assembly']
            # , 
            #        '&&', 'cd', 'assembly/target',
            #        '&&', 'tar', 'xvzf', 'grpahscope.tar.gz']
            workingdir = os.path.join(repo.home, "interactive_engine")
    if component == "analytical":
        subprocess.run(['make','analytical'], cwd=workingdir, stderr=sys.stderr, stdout=sys.stdout)
        click.echo("done")
        # cmd = ['make', 'analytical']
        # if with_java:
        #     cmd = ['make', 'analytical-java']
    if component == "client":
        cmd = ['make', 'client']
    if component == "coordinator":
        cmd = ['make', 'coordinator']

    # click.echo(f"cmd={cmd}, cwd={workingdir}")
    # process = subprocess.Popen(cmd,
    #                            cwd=workingdir,
    #                            stdout=subprocess.PIPE,
    #                            stderr=subprocess.PIPE)
    # stdout, stderr = process.communicate()
    # if stdout:
    #     click.echo(stdout)
    # if stderr:
    #     click.echo(stderr)

@click.command()
def make_image():
    """Make docker images from source code for deployment.
    """
    click.echo('make_image')


cli.add_command(make)
cli.add_command(make_image)
