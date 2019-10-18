@echo off

echo Are you sure you want to do this? It is pretty much unstoppable once it starts.
echo To begin, hit space three times.
pause > nul
echo 2 more times.
pause > nul
echo Last chance!
pause > nul
:A
start java -Xmx1500M Main
start java -Xmx1500M Main
go