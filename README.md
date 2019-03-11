# Testcontainers integration with Fluentlenium framework
A simple project with an example of how we can integrate [testcontainers](https://www.testcontainers.org/) Java library with [Fluentlenium](https://fluentlenium.com/) framework

![aaa](https://github.com/meldmy/testcontainers-fluentlenium/raw/master/readme/testcontainers-fluentlenium-logo.png)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites
What do you need to have already installed:


Docker - please see [General Docker requirements](https://github.com/meldmy/testcontainers-fluentlenium/raw/master/readme/testcontainers-fluentlenium-logo.png)  
Check your Docker version by as follows:
```
$ docker version

Client:
Version:      1.8.0
API version:  1.20
Go version:   go1.4.2
Git commit:   f5bae0a
Built:        Tue Jun 23 17:56:00 UTC 2015
OS/Arch:      linux/amd64

Server:
Version:      1.8.0
API version:  1.20
Go version:   go1.4.2
Git commit:   f5bae0a
Built:        Tue Jun 23 17:56:00 UTC 2015
OS/Arch:      linux/amd64
```
## Running the tests

Tests executed on a browser from a fixed, clean image.

Use the following Gradle command to run Fluentlenium test on Testcontainers:

```
./gradlew fluentleniumTest
```
