inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The op_global_planner package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "op_global_planner"
ROS_BPN = "op_global_planner"

ROS_BUILD_DEPENDS = " \
	autoware-can-msgs \
	geometry-msgs \
	message-generation \
	op-planner \
	op-ros-helpers \
	op-utility \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rospy \
	std-msgs \
	vector-map-msgs \
	libwaypoint-follower \
	rubis-lib \
	nav-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-can-msgs \
	geometry-msgs \
	message-generation \
	op-planner \
	op-ros-helpers \
	op-utility \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rospy \
	std-msgs \
	vector-map-msgs \
	libwaypoint-follower \
	rubis-lib \
	nav-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-can-msgs \
	geometry-msgs \
	message-generation \
	op-planner \
	op-ros-helpers \
	op-utility \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rospy \
	std-msgs \
	vector-map-msgs \
	libwaypoint-follower \
	rubis-lib \
	nav-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=op_global_planner"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "c608866fd2b86d27e686f17ddbf1b0f92253c1e0"
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