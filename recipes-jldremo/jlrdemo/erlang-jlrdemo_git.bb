#
# Yocto recipe for the Jaguar Land Rover demo
#
# Please see
# http://www.yoctoproject.org/docs/current/poky-ref-manual/poky-ref-manual.html
# for details on the variables herein.

# Include a short description of the recipe
DESCRIPTION = "Jaguar Land Rover Tizen IVI HVAC demo"

# Symbolic description of the type of software this is.
# Can be pretty much anything
SECTION = "application"

# License + checksum that this application is provided under.
# The LICENSE file should be in the root direcotry of the tree retrieved
# from the SRC_URI below.
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

# Packages that this application need. Do not remove erlang since
# the erlang runtime system and the Exosense Device modules are included
# through this dependency.
DEPENDS += " exosense erlang-lhttpc erlang-can"

# Source revision to fetch from the SRC_URI
SRCREV="AUTOINC"

# Recipy revision. Tick this if you make incompatible changes to the recipe.
PR = "r0"

# The URI to fetch the application source code from.
# Replace this with an URI that refers to the applicaiton source code.
SRC_URI = "git://github.com/Feuerlabs/jlrdemo.git;protocol=git"

# The sub directory under the build directory to check out the source code into.
S = "${WORKDIR}/git"

# Travelping's Tetrapak packager is used to handle packages.
inherit tetrapak

#
# Add an erlang package through the TPLINO Yocto tools provided by Travelping
#
python () {
    erlang_def_package("jlrdemo", "jlrdemo-*", "ebin priv", "src include README", d)
}
