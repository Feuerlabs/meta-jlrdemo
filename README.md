# Exosense Device - Jaguar Land Rover Tizen IVI HVAC control demo

This repository contains the Yocto recipes to build the JLR demo
application running on top of the Exosense Device software stack.

Please see the `git://github.com/Feuerlabs/jlrdemo` repository
for instructions on how to build the Jaguar Land Rover demo.

The build_conf directory contains the config files to install in
the created build/conf directory. Make sure to edit the directories
in bblayers.conf to reflect the local structure before building.

# Further reading

Please see:

	git@github.com:Feuerlabs/meta-exosense.git
	
for detailed instructions on how to build a firmware with Linux,
Exosense, and an custom application that can be flashed to target
hardware.

