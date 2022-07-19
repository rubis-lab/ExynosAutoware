inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The gnss_converter package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "gnss_converter"
ROS_BPN = "gnss_converter"

ROS_BUILD_DEPENDS = " \
	roscpp \
	std-msgs \
	inertiallabs-msgs \
	message-filters \
	tf \
	libeigen \
	opencv \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	roscpp \
	std-msgs \
	inertiallabs-msgs \
	message-filters \
	tf \
	libeigen \
	opencv \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	roscpp \
	std-msgs \
	inertiallabs-msgs \
	message-filters \
	tf \
	libeigen \
	opencv \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=gnss_converter"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "77c17c175f315294da25a38d51eeca505b09cf0e"
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