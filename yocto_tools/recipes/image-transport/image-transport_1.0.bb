inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The image_transport package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_transport"
ROS_BPN = "image_transport"

ROS_BUILD_DEPENDS = " \
	message-filters \
	pluginlib \
	rosconsole \
	roscpp \
	roslib \
	sensor-msgs \
	rubis-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	message-filters \
	pluginlib \
	rosconsole \
	roscpp \
	roslib \
	sensor-msgs \
	rubis-lib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	message-filters \
	pluginlib \
	rosconsole \
	roscpp \
	roslib \
	sensor-msgs \
	rubis-lib \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=image_transport"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "64bb2b6835231d22c923b71d1b9157db09855d8e"
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