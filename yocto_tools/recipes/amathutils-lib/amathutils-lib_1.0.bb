inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The amathutils_lib package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "amathutils_lib"
ROS_BPN = "amathutils_lib"

ROS_BUILD_DEPENDS = " \
	rostest \
	autoware-msgs \
	roscpp \
	roslint \
	tf2 \
	tf \
	libeigen \
	tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	rostest \
	autoware-msgs \
	roscpp \
	roslint \
	tf2 \
	tf \
	libeigen \
	tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	rostest \
	autoware-msgs \
	roscpp \
	roslint \
	tf2 \
	tf \
	libeigen \
	tf2-geometry-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=amathutils_lib"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "4faef4a69b0d0251b53c31b1038b42f45f891246"
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