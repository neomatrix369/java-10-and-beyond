# Java 10

Exercises based on some of the features of Java 10 released in the Early Access / General Availability build of JDK10.

___


####   Please note you are in the `master` branch which contains exercises which need to be solved by looking at documentation or resources provided in this repo. Hints may be provided within the source or script files. If you hit a roadblock and really want to see a possible solution you can switch to the `exercise-solutions` branch [switch to exercise-solutions branch]((https://github.com/neomatrix369/java-10-and-beyond/blob/exercise-solutions/java10/README.md)) for that. 

####   Looking at the solutions can take away the challenge behind solving the exercises. Stay on the `master` branch in case you would like to continue to have fun solving the exercises and working through the challenges.

___

## Setup (all platforms)

See [Download, install and verify JDK](setupAndVerifyJDK.md) and return to this page to continue with the rest of the steps.
         
#### Download and install `git` or `git-bash`

- Ensure you have a `git` client installed on your local machine/VM/vagrant box, for Windows users `git-bash` is recommended 

#### Download and install the `tree` and `wget` command

See [Download and install tree and wget](setupTreeAndWget.md) and return to this page to continue with the rest of the steps.

#### Vagrant box

- Alternatively a Vagrant box is available at https://github.com/ali-ince/LJC_April2017_Hackday, please make use of this facility (thanks @ali-ince).

#### (Optional) Install JDK 10 compliant IDE

- Install the latest IDE (IntelliJ, Eclipse, NetBeans - paid or community version) that supports JDK 10 EA, once installed configure the IDE to pickup the JDK 10 EA installed in the previous steps.

See [Download, install and configure Eclipse Oxygen for JDK10](setupEclipseOxygen.md).

#### Other preparations

- Get familiar with the command-line a bit as we will be using much of it during the weekend

- Prepare your VMs or cloud instances with the above, in case your local machine is not up for any installation or configurations 

**Note:** the bash files provided should work on Linux and in theory on the MacOS as well.

##### Windows users

 - if you use `git-bash` (recommended) or `cgywin` should work for you - run the `.sh` scripts in one of the the environments. In the worst case scenario, we would have to manually convert the `.sh` files into `.bat`, with minor tweaks should also work there. Happy to receive a pull request for it. Or you could use **bach**, a platform independent Java Shell Builder. It's usage is explained in `session-3-jshell`.
 - check if the literal JDK path (or `%JAVA_HOME%`) has been added to the `PATH` environment variable or add it manually
 - ensure the JDK is installed in a folder where the name does not have a space in it 
 - in case folder name looks something `C:\Program files...`, ensure that (name does not contain spaces):
    - the path to the JDK in `JAVA_HOME` has `C:\Program~1` instead of `C:\Program files...`
    - the environment variable `PATH` refers to the `JAVA_HOME` environment variable
    - the environment variable `CLASSPATH` refers to the `JAVA_HOME` environment variable
 - in some instances `jlink` was not yet available when JDK is installed via the `.exe` file, even after the above path settings were applied (please verify beforehand)

## Exercises / examples covered

Please ensure you have verified that the necessary JDK programs work in your environment with the help of the [Download, install and verify JDK](setupAndVerifyJDK.md) resource. 

- Session 1: [Topic 1]
   - ... [./...](.../...)
   
- Session 2: [Topic 2]
   - ... [./...](.../...)

- Session 3: [Topic 3]
   - ... [./...](.../...)

- Session 3: [Topic 4]
   - ... [./...](.../...)
        
Each example is enclosed in a folder of its own containing bash scripts to compile, package and run the respective examples. Use these scripts for each of the examples.

## Community contributions

See [guidelines on how to contribute](CONTRIBUTING.md).

## License

See [License](LICENSE) document to find out about the licensing terms and conditions.

## Resources

### Must reads
- [Features in Java 10](https://dzone.com/articles/features-in-java-10)
- [What's Planned for JDK 10?](https://dzone.com/articles/whats-planned-for-jdk-10)
- [Java 10 Checklist: Meet the Declaration That Will Change the Way You Code](https://blog.takipi.com/java-10-checklist-meet-the-declaration-that-will-change-the-way-you-code/)

### Other resources
- [JDK 10 Resources](./Java-10-Resources.md)
- [Adopt OpenJDK homepage](https://adoptopenjdk.java.net/)
- [Adopt OpenJDK: Getting Started Kit](http://bit.ly/1NUkPWw)

---
