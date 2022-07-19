inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The calibration_publisher package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "calibration_publisher"
ROS_BPN = "calibration_publisher"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	image-transport \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	opencv \
	yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	image-transport \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	opencv \
	yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	image-transport \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	opencv \
	yaml-cpp \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=calibration_publisher"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "a88ac8317a54b0321505f076403c3d27a558a8b3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_catkin
BBCLASSEXTEND_append = "native nativesdk"

FILES_${PN} += " \
	${ros_libdir}/*/* \
"

FILES_${PN}-dev += " \
	${ros_libdir}/*/* \
"