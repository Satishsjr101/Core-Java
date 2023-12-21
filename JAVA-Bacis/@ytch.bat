@echo off
:start
start "" "https://www.youtube.com"
set /a count+=1
if %count%==100 goto end
goto start
:end
