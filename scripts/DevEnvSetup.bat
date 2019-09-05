:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
::													     ::
::	DevEnvSetup.bat (Windows Gradle Script For Forward)  ::
::													     ::
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

@echo off

cd ..

call gradlew setupDecompWorkspace
call gradlew eclipse