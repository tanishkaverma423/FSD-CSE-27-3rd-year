@echo off
setlocal EnableExtensions
set "MAVEN_VERSION=3.9.11"
set "MAVEN_HOME_LOCAL=%USERPROFILE%\.m2\wrapper\dists\apache-maven-%MAVEN_VERSION%"
set "MAVEN_EXE=%MAVEN_HOME_LOCAL%\apache-maven-%MAVEN_VERSION%\bin\mvn.cmd"
set "MAVEN_ZIP=%TEMP%\apache-maven-%MAVEN_VERSION%-bin.zip"
set "MAVEN_URL=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/%MAVEN_VERSION%/apache-maven-%MAVEN_VERSION%-bin.zip"
if not exist "%MAVEN_EXE%" (
  echo.
  echo Maven %MAVEN_VERSION% is not installed. Downloading it automatically...
  powershell -NoProfile -ExecutionPolicy Bypass -Command "$ErrorActionPreference='Stop'; New-Item -ItemType Directory -Force -Path '%MAVEN_HOME_LOCAL%' | Out-Null; Invoke-WebRequest -Uri '%MAVEN_URL%' -OutFile '%MAVEN_ZIP%'; Expand-Archive -Path '%MAVEN_ZIP%' -DestinationPath '%MAVEN_HOME_LOCAL%' -Force; Remove-Item '%MAVEN_ZIP%' -Force"
  if errorlevel 1 (echo Failed to download Maven. Check your internet connection. & exit /b 1)
)
call "%MAVEN_EXE%" %*
endlocal
