inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The topic_tools package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "topic_tools"
ROS_BPN = "topic_tools"

ROS_BUILD_DEPENDS = " \
	cpp-common \
	message-generation \
	rosconsole \
	roscpp \
	rostest \
	rostime \
	rosunit \
	std-msgs \
	xmlrpcpp \
	message-runtime \
	rosbash \
	rostopic \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	cpp-common \
	message-generation \
	rosconsole \
	roscpp \
	rostest \
	rostime \
	rosunit \
	std-msgs \
	xmlrpcpp \
	message-runtime \
	rosbash \
	rostopic \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	cpp-common \
	message-generation \
	rosconsole \
	roscpp \
	rostest \
	rostime \
	rosunit \
	std-msgs \
	xmlrpcpp \
	message-runtime \
	rosbash \
	rostopic \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=topic_tools"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "ee3619d528de03be0101ca8482a37ac75403e304"
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