# Java/JDK 10 Resources

## JUG Hackday Resources

- ...[Placeholder for next JUG event to take place]...

***

## Java/JDK 10 Resources

- [General Availability / Early Access Download: OpenJDK and OracleJDK](http://jdk.java.net/10/);
- [Installation Guide](https://docs.oracle.com/javase/10/install/overview-jdk-10-and-jre-10-installation.htm#JSJIG-GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
- [Details on Java 10 supported platforms](http://www.oracle.com/technetwork/java/javase/documentation/jdk10certconfig-4417031.html)

## Oracle/OpenJDK Resources on Java 10

- [JDK 10 Project Page](http://openjdk.java.net/projects/jdk/10/); includes a list of JEPs targeted for Java 10 (see [JDK Project](http://openjdk.java.net/projects/jdk/))
- [List of all JEPs](http://openjdk.java.net/jeps/0)
- List of pre-Java 10/Java 10 bug fixes: 
    - [Official list](http://www.oracle.com/technetwork/java/javase/2col/10-0-1-bugfixes-4308880.html) 
    - [Bugs database: JDK 10](https://www.oracle.com/search/results?Ntt=%22JDK%2010%22&Dy=1&Nty=1&cat=bugs&Ntk=S3) 
    - [Bugs database: Java 10](https://www.oracle.com/search/results?Ntt=%22Java%2010%22&Dy=1&Nty=1&cat=bugs&Ntk=S3)
    - [CPU & Memory limits issues: JDK-8146115](https://bugs.openjdk.java.net/browse/JDK-8146115)
    - [Attaching to Namespace issues: JDK-8179498](https://bugs.openjdk.java.net/browse/JDK-8179498)
- [Java 10 Documentation](https://docs.oracle.com/javase/10/index.html)
- [JavaDoc](https://download.java.net/java/jdk10/docs/api/overview-summary.html) (API documentation)
- [Quality Outreach](https://wiki.openjdk.java.net/display/quality/Quality+Outreach) (we could use your help here)

### Download Java 10 binaries
- [Download JDK 10 binaries from OTN](http://www.oracle.com/technetwork/java/javase/downloads/index.html) [Alternative source](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html)
- [JDK 10 GA/Updates binaries](http://jdk.java.net/10/)
- [JDK SE 10 RI binaries](http://jdk.java.net/java-se-ri/10)
- [Adopt OpenJDK 10 binaries](https://ci.adoptopenjdk.net/) - look for the tab OpenJDK builds  

***

### Community resources

- [Placeholder](...) (...Author)

### Talks

- [Placeholder](...) (...Author)

### Interviews

- [Placeholder](...) (...Author)

### Java 10 features

- [How Java 10 will CHANGE the Way You Code | OverOps Blog](https://blog.takipi.com/how-java-10-will-change-the-way-you-code/)
- [Java 10: New Features And Enhancements - DZone Java](https://dzone.com/articles/java-10-new-features-and-enhancements)
- [Java 10 JDK: The new features in Java 10 | InfoWorld](https://www.infoworld.com/article/3230507/java/java-jdk-10-what-new-features-to-expect-in-the-next-java.html)
- [10 new features in java 10!](https://aboullaite.me/10-new-features-in-java-10/)
- [JDK 10: 10 new features and enhancements in Java 10](http://www.thewindowsclub.com/java-10-new-features)
- [It is time for Java 10 - All new features and release notes - JAXenter](https://jaxenter.com/java-10-is-finally-here-lets-have-a-look-at-its-new-features-142654.html)
- [Features in Java 10 - DZone Java](https://dzone.com/articles/features-in-java-10)
- [Java 10 – An Introduction](https://blog.idrsolutions.com/2018/04/java-10-an-introduction/)

### JEPs and Articles

[JEP 286](http://openjdk.java.net/jeps/286) Local-Variable Type Inference:

- [Java 10 Sneak Peek: Local-Variable Type Inference (var)!](https://medium.com/@afinlay/java-10-sneak-peek-local-variable-type-inference-var-3022016e1a2b) (Adrian D. Finlay)
- [First Contact With ‘var’ In Java 10](https://blog.codefx.org/java/java-10-var-type-inference/) (Codefx, Nicolai Parlog)
- [See under Value Types of The Top 3 Java Performance Improvements we're looking forward to](https://www.opsian.com/blog/top-3-java-performance-improvements/)

[296](http://openjdk.java.net/jeps/296) Consolidate the JDK Forest into a Single Repository:

- [Oracle Consolidates the OpenJDK 10 Repository Forest](https://www.infoq.com/news/2017/09/openjdk-10-consolidated-repo) (Abraham Marín Pérez)

[JEP 304](http://openjdk.java.net/jeps/304) Garbage-Collector Interface: 

- [Java 10 improvements to Garbage Collection explained in 5 minutes](https://blog.idrsolutions.com/2018/04/java-10-improvements-to-garbage-collection-explained-in-5-minutes/) (Rob, Software Engineer at IDRSolutions)
- Related JEPs: [JEP 318 - Epsilon: An Arbitrarily Low-Overhead Garbage Collector](http://openjdk.java.net/jeps/318) and [JEP 189 – Shenandoah: An Ultra-Low-Pause-Time GC](http://openjdk.java.net/jeps/189)

[JEP 307](http://openjdk.java.net/jeps/307) Parallel Full GC for G1:

- [Java 10 improvements to Garbage Collection explained in 5 minutes](https://blog.idrsolutions.com/2018/04/java-10-improvements-to-garbage-collection-explained-in-5-minutes/) (Rob, Software Engineer at IDRSolutions) 
- [#Java Training Session](https://twitter.com/java/status/986759064481878016) (Twitter handle @Java)
- [JEP 307: Parallel Full GC for G1 - discussion thread on OpenJDK mailing list](http://mail.openjdk.java.net/pipermail/hotspot-gc-dev/2017-July/020307.html) (Members of the OpenJDK HotSpot group)
- [Java on Docker will no longer suck: improvements coming in Java 10](https://www.opsian.com/blog/java-10-with-g1/) (By Richard Warburton, Sadiq Jaffer from Opsian)

[JEP 310](http://openjdk.java.net/jeps/310) Application Class-Data Sharing:

- [Improve Launch Times On Java 10 With Application Class-Data Sharing](https://blog.codefx.org/java/application-class-data-sharing/) (Codefx, Nicolai Parlog)
- [#Java Training Session shared by @Java](https://twitter.com/java/status/986759064481878016)

[JEP 312](http://openjdk.java.net/jeps/312) Thread-Local Handshakes:

- [Discussions on StackOverflow](https://stackoverflow.com/questions/47222819/explanation-of-the-thread-local-handshakes) (SO Community)

[JEP 313](http://openjdk.java.net/jeps/313) Remove the Native-Header Generation Tool (javah):

- [SO discussion on generating native header file](https://stackoverflow.com/questions/21663423/generating-header-file-with-jni-using-javah) (SO Community)

[JEP 314](http://openjdk.java.net/jeps/314) Additional Unicode Language-Tag Extensions:

- [Internationalization Enhancements in JDK 10](https://docs.oracle.com/javase/10/intl/internationalization-enhancements-jdk-10.htm#JSINT-GUID-B76A32BB-DB66-4B51-BA06-F88B562B5A59)

[JEP 316](http://openjdk.java.net/jeps/316) Heap Allocation on Alternative Memory Devices:

- [Discussion on OpenJDK mailing list](http://openjdk.5641.n7.nabble.com/RFR-M-8171181-Supporting-heap-allocation-on-alternative-memory-devices-td300109.html) (OpenJDK Community)

[JEP 317](http://openjdk.java.net/jeps/317) Experimental Java-Based JIT Compiler:

- [Java 10’s Experimental JIT Compiler explained in 5 minutes](https://blog.idrsolutions.com/2018/04/java-10-project-graal-explained-5-minutes/)  (Rob, Software Engineer at IDRSolutions) 
- [#Java Training Session](https://twitter.com/java/status/986759064481878016) (Twitter handle @Java) 
- Related JEPs: [JEP 243: Java-Level JVM Compiler Interface](http://openjdk.java.net/jeps/243) and [JSR 223: Scripting for the Java Platform](https://www.jcp.org/en/jsr/detail?id=223) (also see [Scripting for the Java Platform](https://en.wikipedia.org/wiki/Scripting_for_the_Java_Platform))

[JEP 319](http://openjdk.java.net/jeps/319) Root Certificates:

- [OpenJDK 10 Now Includes Root CA Certificates](https://dzone.com/articles/openjdk-10-now-includes-root-ca-certificates) (Jim Connors)
- [Configure and populate the cacerts keystore with a set of root certificates - prior to JDK 10](http://www.oracle.com/technetwork/java/javase/9all-relnotes-3704433.html#JDK-8189131) (JavaDocs by Oracle)

[JEP 322](http://openjdk.java.net/jeps/322) Time-Based Release Versioning:

- [Tweet from @Java](https://twitter.com/java/status/976163714700324866) (Twitter handle @Java)
- [No Free Java LTS Version?](https://medium.com/codefx-weekly/no-free-java-lts-version-b850192745fb) (Codefx, Nicolai Parlog)

Docker fixes and enhancements:
- [Java on Docker will no longer suck: improvements coming in Java 10](https://www.opsian.com/blog/java-on-docker/) (By Richard Warburton, Sadiq Jaffer from Opsian)

### Blog posts, presentations, slides

- [The Top 3 Java Performance Improvements we're looking forward to](https://www.opsian.com/blog/top-3-java-performance-improvements/) (By Richard Warburton, Sadiq Jaffer from Opsian) - a mix of Java 9, 10 and 11

### Books

* [....]() (Publisher; Author)

### Courses

* [....] (...., (link)[link])

### Repositories

- [CodeFX-org/demo-java-10](https://github.com/CodeFX-org/demo-java-10) (Codefx, Nicolai Parlog)

#### Misc

- [Oracle released JDK 10 press release](https://www.oracle.com/corporate/pressrelease/Java-10-032018.html)
- [A blog post related to Java 10 release](https://blogs.oracle.com/java-platform-group/introducing-java-se-10)
- [Java 10 White Paper from Oracle](https://developer.oracle.com/devo/res/pdf/1385446602743/Oracle-Java10.pdf)
