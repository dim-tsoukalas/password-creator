# Intruduction
Generate random passwords with java. 
The user selects the number of passwords and characters he needs and the program return random passwords <sub>different every time</sub>.

# Technologies
- [Java SE 17](https://www.oracle.com/java/technologies/downloads/archive/)

# Examples of use

The class _PasswordMaker_ creates the passwords. The Main class performs the functions from _PasswordMaker_.
At Main the first input of _PasswordMaker_ is the **number of characters** of the passwords and the second input is the **number of passwords**. As you can see in Main below:
https://github.com/dim-tsoukalas/password-creator/blob/bfd9fead4884685d03a1d0cf330e352ae85651c0/src/Main.java#L7-L8

After the compile of our programme it displays at your screen 25 random passwords with 7 characters
```
run:
4e%7Bm# 9x%8Jt# 6@m7!gL 9@q9!zN 5$g7#hO 0l!4Vx# 8x$3Bb$ 9z!6Qi! 
Zh%2r%0 Mj#4l#5 %vX2#e4 Zd@4t!0 6u@1Ts@ $jM7$d2 6w$4Hf$ #yW3#e7 
Hf#4t!8 @fW2#r0 0%q6@gP @dB0@z0 Oh%2f#4 Zj%2t@1 8%c2#vJ Tc#0m#8 
4#d8!xA BUILD SUCCESSFUL (total time: 0 seconds)
```
# Launch
To run this project, type the following command inside the *~/password-creator/src* directory

```bash
$ javac Main.java
$ java Main
```

# Sources
- Java Api
- Tutorials at web
