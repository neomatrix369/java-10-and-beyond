## Download, install and verify JDK

#### Download and install latest version of the JDK 10 EA

- Download JDK 10 EA
  
  - Early Access build of JDK10 is available at [http://jdk.java.net/10/](http://jdk.java.net/10/)

- Install JDK 10 EA
  
  - Install using a script

    **Linux and MacOSX users only:** the bash script ```getJDK10.sh``` in the root directory of this repo, helps download the latest JDK from Oracle. Please run this once the repo is cloned. 

    **Windows users:** please feel free to run this script and if there are any tweaks to get it to work successfully, please let us know via a pull request.

  - Install manually

    - Linux
       - `tar -xvf jdk-10*.tar`
       - `mv -f jdk-10 [destination]`  (might need to use `sudo` here)
       - update your `.bashrc` with `export JAVA_HOME=[jdk destination]`
       - update your `.bashrc` with `export PATH=$JAVA_HOME/bin:$PATH`
       - `source ~/.bashrc` 
    
         `[destination]` usually `/usr/lib/...` or related folder
    
    - MacOSX 
       #### Manual way
       - Please refer to [this guide]( https://github.com/musinoli/guides/blob/master/setup_jigsaw.md) - thanks Nolita ([@musinoli](https://github.com/musinoli)) for your help
       - In case a `.dmg` file is available, download it and follow the installation steps, you will still have to update your `JAVA_HOME` and start script as mentioned in [this guide]( https://github.com/musinoli/guides/blob/master/setup_jigsaw.md).
       - update your `.bashrc` with `export PATH=$JAVA_HOME/bin:$PATH`

       #### Via Brew and jenv
       You will need the latest version of brew with cask support (1.1.13 at the time of writing). If you don't have brew installed, go [here](https://brew.sh/) first.
       - `brew install jenv`
       - `brew install caskroom/versions/java10-beta`

       You will need to make sure jenv is evaluated in every terminal session. Add `eval "$(jenv init -)"` to your shell's .rc file

       Now run `jenv versions`. The output might differ (if you have other JDK's installed) but in general you should see something like this:
       ```
       ➜  ~ jenv versions
         system
       * 1.8 (set by /Users/ioannis/.jenv/version)
         1.8.0.121
         10-ea
         oracle64-1.8.0.121
         oracle64-10-ea
       ```
       If `10-ea` or `oracle64-10-ea` does not appear, add it manually

       `jenv add /Library/Java/JavaVirtualMachines/jdk-10.jdk/Contents/Home`

       If you want to limit use of JDK 10 to source in a specific directory, switch to that directory and do:

       `jenv local 10-ea`

       e.g.
       ```
       ➜  ~ cd test
       ➜  test: jenv local 10-ea
       ➜  test: jenv version
       10-ea (set by /Users/ioannis/test/.java-version)
       ➜  test: java -version
       java version "10-ea"
       Java(TM) SE Runtime Environment (build 10-ea+163)
       Java HotSpot(TM) 64-Bit Server VM (build 10-ea+163, mixed mode)
       ```
        
    - Windows
       - the file format has changed over time, so you might have downloaded either an `.exe` or a `.zip`.
         - If you have an executable file, then run it and follow the instructions
         - If you have a zip file, then just unzip it
       - Make a note of the destination 
       - Edit the `JAVA_HOME` and `PATH` environment variables via the `My Computer` > `Properties` option
         - `JAVA_HOME`: `JAVA_HOME=[jdk destination]`
         - `PATH`: `PATH=%JAVA_HOME%/bin;%PATH%`
         
           `[destination]` usually `C:\Program Files\Java\...` or related folder  

##### Verify JDK installation

###### java

Say you have downloaded and installed the JDK 10 EA (build 165) binary from the above step, try the below commands:

```
    $ java -version
```

As output you should get something like this:

```
    java version "10-ea"
    Java(TM) SE Runtime Environment (build 10-ea+165)
    Java HotSpot(TM) 64-Bit Server VM (build 10-ea+165, mixed mode)
```

###### javac

```
    $ javac -version
```

As output you should get something like this:

```
    javac 10-ea
```

###### jlink

Verify if `jlink` is available in your current environment:

```
    $ jlink --version
```

As output you should get something like this:

```
    10
```

###### jshell

Verify if `jshell` is available in your current environment:

```
    $ jshell --version
```

As output you should get something like this:

```
    jshell 10
```

###### jdeps

Verify if `jdeps` is available in your current environment:

```
    $ jdeps --version
```

As output you should get something like this:

```
    10
```

###### jmod

Verify if `jmod` is available in your current environment:

```
    $ jmod --version
```

As output you should get something like this:

```
    10
```


##### Alternative to keep JAVA\_HOME and PATH

*NOTE*: Only for Linux and MacOSX users. 

If you don't like changing ```JAVA_HOME``` and ```PATH``` and you want to have an easy way to change your local Java version:

- Keep your unzipped files in a single directory. For example:

```
    $ pwd
    /usr/local/java
    
    $ ls -og
    total 12
    drwxr-xr-x 8 4096 sep 23  2016 jdk1.8.0_111
    drwxr-xr-x 8 4096 dic 13  2016 jdk1.8.0_121
    drwxr-xr-x 8 4096 ago 15 12:10 jdk-10+181 
```

- Create a symbolic link ```jdk``` to desired JDK: 

```
    $ ln -s jdk-10+181 jdk 

    $ ls -og
    total 12
    lrwxrwxrwx 1   12 abr 17 17:16 jdk -> jdk-10+181
    drwxr-xr-x 8 4096 sep 23  2016 jdk1.8.0_111
    drwxr-xr-x 8 4096 dic 13  2016 jdk1.8.0_121
    drwxr-xr-x 8 4096 ago 15 12:10 jdk-10+181 
```

```JAVA_HOME``` and ```PATH``` will use ```/usr/local/java/jdk``` forever.

To change your local Java version, you only need to change the symbolic link.

Now return to the [Download, install and verify JDK](./README.md#setup-all-platforms) section in the main [README.md](./README.md) file and continue with the rest of the steps.
