# Michael-Scott Lock-Free Queue

[![Build Status](https://travis-ci.com/IST-CONCURRENCY-COURSE-2018/msqueue-<your_GitHub_account>.svg?token=B2yLGFz6qwxKVjbLm9Ak&branch=master)](https://travis-ci.com/IST-CONCURRENCY-COURSE-2018/msqueue-<your_GitHub_account>)

Under this task, you need to write a Michael-Scott queue implementation. Do it most straightforward, without any optimizations.

Please, use [IntelliJ IDEA](https://www.jetbrains.com/idea/) (better) or Eclipse/Netbeans (worse) as a development environment. Do not use vim or emacs!

## Project description
This project includes the following files:

* `Queue.java` contains the queue interface.
* `MSQueue.java` contains a sequential queue implementation, which has similar to the Michael-Scott queue structure. This implementation is not _thread-safe_.
* `QueueBenchmark.java` contains a JMH concurrent benchmark.
* `pom.xml` contains information about the project and configuration details used by Maven.

It is simpler to use Java 8 in order not to have problems with modules.

## Task description
You need to modify the `MSQueue` implementation so that it becomes safe to use from multiple threads simultaneously. 
Use [this paper](http://www.cs.rochester.edu/~scott/papers/1996_PODC_queues.pdf) and the lecture slides as a help.
Do not use any optimizations, write the most straightforward implementation!

## Build and testing
Use `mvn test` command to test your solution. The following tests are automatically executed:

* `FunctionalTest.java` tests the basic correctness (sequential);
* `LinearizabilityTest.java` checks for linearizability (concurrent).

## Submission format
Do the assignment in this repository, and commit (and push!) your solution to submit it. 

Replace `<your_GitHub_account>` in the beginning of this file with your GitHub account before submission (two places: image and build links). This is required to show a build status in Travis.