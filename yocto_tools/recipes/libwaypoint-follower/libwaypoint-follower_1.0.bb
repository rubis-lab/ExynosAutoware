inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The libwaypoint_follower package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "libwaypoint_follower"
ROS_BPN = "libwaypoint_follower"

ROS_BUILD_DEPENDS = " \
	rostest \
	amathutils-lib \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	rosunit \
	std-msgs \
	libeigen \
	tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	rostest \
	amathutils-lib \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	rosunit \
	std-msgs \
	libeigen \
	tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	rostest \
	amathutils-lib \
	autoware-msgs \
	geometry-msgs \
	roscpp \
	roslint \
	rosunit \
	std-msgs \
	libeigen \
	tf2-eigen \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=libwaypoint_follower"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "8a687f589079eed353ae925b21b256cfb61ba4fb"
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