inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The op_ros_helpers package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "op_ros_helpers"
ROS_BPN = "op_ros_helpers"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	jsk-recognition-msgs \
	map-file \
	op-planner \
	op-utility \
	pcl-conversions \
	pcl-ros \
	sensor-msgs \
	tf \
	vector-map-msgs \
	libwaypoint-follower \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	jsk-recognition-msgs \
	map-file \
	op-planner \
	op-utility \
	pcl-conversions \
	pcl-ros \
	sensor-msgs \
	tf \
	vector-map-msgs \
	libwaypoint-follower \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	jsk-recognition-msgs \
	map-file \
	op-planner \
	op-utility \
	pcl-conversions \
	pcl-ros \
	sensor-msgs \
	tf \
	vector-map-msgs \
	libwaypoint-follower \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=op_ros_helpers"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "99e3dea765732b7f0dfebd6f8d284c7bf3401455"
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