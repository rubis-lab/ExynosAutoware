inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The inertiallabs_ins package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "inertiallabs_ins"
ROS_BPN = "inertiallabs_ins"

ROS_BUILD_DEPENDS = " \
	roscpp \
	rospy \
	visualization-msgs \
	geometry-msgs \
	std-msgs \
	sensor-msgs \
	tf \
	actionlib-msgs \
	dynamic-reconfigure \
	inertiallabs-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	roscpp \
	rospy \
	visualization-msgs \
	geometry-msgs \
	std-msgs \
	sensor-msgs \
	tf \
	actionlib-msgs \
	dynamic-reconfigure \
	inertiallabs-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	roscpp \
	rospy \
	visualization-msgs \
	geometry-msgs \
	std-msgs \
	sensor-msgs \
	tf \
	actionlib-msgs \
	dynamic-reconfigure \
	inertiallabs-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=inertiallabs_ins"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "57133a203cb3e53f7a537ed71ca68b24a9fe4257"
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