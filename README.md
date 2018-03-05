# About
This repo is simple implementation of cucumber with junit.

## Run the test script locally

```
mvn test -Dcucumber.options="-p json:output\output.json -p html:output src\test\java\features\simpleTest_1.feature"
```


To execute as a custom Awetest script.

### Execute script 
```
cd %0\..\
cp .\tc_assets\pom.xml .\
mkdir src\test\java\features
mkdir src\test\java\step_defination
cp simpleTest.feature .\src\test\java\features\
cp .\tc_assets\RunCukesTest.java .\src\test\java
cp .\tc_assets\MyStepdefs.java .\src\test\java\step_defination
mvn test -Dcucumber.options="-p json:awetest_report\output.json -p html:awetest_report"
```

### Post execute script
```
cp -rf .\awetest_report\ ..\
```
