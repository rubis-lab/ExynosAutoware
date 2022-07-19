inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The detected_objects_visualizer package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=211ba54883815de9f52a3dcd9f281523"

ROS_CN = "detected_objects_visualizer"
ROS_BPN = "detected_objects_visualizer"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	geometry-msgs \
	image-transport \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	geometry-msgs \
	image-transport \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	cv-bridge \
	geometry-msgs \
	image-transport \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	visualization-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=detected_objects_visualizer"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "fb2b0ba08617e616413a9656a10999e6d2d975b6"
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