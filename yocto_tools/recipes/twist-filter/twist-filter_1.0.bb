inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The twist_filter package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "twist_filter"
ROS_BPN = "twist_filter"

ROS_BUILD_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	std-msgs \
	rubis-lib \
	rubis-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	std-msgs \
	rubis-lib \
	rubis-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	std-msgs \
	rubis-lib \
	rubis-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=twist_filter"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "44e134a2fd4c0207f9e318ab3a524a9816d2c0cf"
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