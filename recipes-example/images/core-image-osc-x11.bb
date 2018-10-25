DESCRIPTION = "Image with that boots to oscillocope example"

IMAGE_FEATURES += " splash hwcodecs "

IMAGE_INSTALL += " xorg-minimal-fonts  packagegroup-core-x11-base liberation-fonts cantarell-fonts  packagegroup-core-boot  oscilloscope "


LICENSE = "MIT"

inherit core-image distro_features_check

REQUIRED_DISTRO_FEATURES = "x11 "
