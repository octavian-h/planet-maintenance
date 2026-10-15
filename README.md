# Clean code with The Little Prince

## Description

A small Java project for a talk on clean code. It uses the Little Prince's daily chores on his planet (sweeping three volcanoes, pulling up
baobab sprouts, caring for the rose) to show three principles:

- DRY: don't repeat yourself
- KISS: keep it simple
- SRP: single responsibility principle

## Requirements

To build and run this application you need to install the followings:

- [JDK 25](https://www.oracle.com/java/technologies/downloads/) (or newer)
- [Maven](https://maven.apache.org/install.html)

On macOS, you can use these commands (assuming that [Homebrew](https://brew.sh/) is already installed):

```bash
brew install openjdk@25
brew install --ignore-dependencies maven
```

## Usage

To build and run the tests, follow these steps:

```bash
mvn test
```