from setuptools import setup

setup(
    name='gs',
    version='0.1.0',
    py_modules=['gsutil'],
    install_requires=[
        'Click',
    ],
    entry_points={
        'console_scripts': [
            'gsutil = gsutil:cli',
        ],
    },
)