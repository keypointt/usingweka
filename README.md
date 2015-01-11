# README #

## Jan-10-2015: lauching my personal project - recommendation system##
Basically the idea is, using Weka clustering algorithms, to build multiple clustering models.
And maybe later, I'll try to re-write it in python, since there are more powerful libs in python.

A data set resource of movie ratings: http://grouplens.org/datasets/movielens/
weka-3.6

ps: basically, I'm using my weekend to build this, and also weekday nights after work if free.

##新版的weka的manual里有一章“Chapter 16 Using the API”，专门讲API的##

cannot launch weka-GUI at first, since before this usingWeka project, I used ant for building the whole weka source code (weka project), and java config is changed to openJDK (while I'm using Oracle_JDK) by stupidly installing ant on my machine, so I changed the java config to oracle_jdk.

Steps:

1 . see different JDK versions: 

```
#!java

update-alternatives --display java
```
2 .see the config status:

```
#!java

update-alternatives --config java

```
3 . get below message

```
#!java

There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                           Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-6-openjdk-i386/jre/bin/java   1061      auto mode
  1            /usr/lib/jvm/java-6-openjdk-i386/jre/bin/java   1061      manual mode
  2            /usr/lib/jvm/jdk1.7.0_51/bin/java               300       manual mode


Press enter to keep the current choice[*], or type selection number: 

```
then I input 2, and hit enter. Then problem fixed, java is changed back to oracle JDK I guess.



### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)