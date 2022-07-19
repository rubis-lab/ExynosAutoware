inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ins_twist_generator package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "ins_twist_generator"
ROS_BPN = "ins_twist_generator"

ROS_BUILD_DEPENDS = " \
	roscpp \
	std-msgs \
	rubis-msgs \
	tf \
	can-data-msgs \
	message-filters \
	geometry-msgs \
	inertiallabs-msgs \
	libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	roscpp \
	std-msgs \
	rubis-msgs \
	tf \
	can-data-msgs \
	message-filters \
	geometry-msgs \
	inertiallabs-msgs \
	libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	roscpp \
	std-msgs \
	rubis-msgs \
	tf \
	can-data-msgs \
	message-filters \
	geometry-msgs \
	inertiallabs-msgs \
	libeigen \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=ins_twist_generator"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "77e651b8ae5f617bfc932e7e3dbd09f5cf2c8154"
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