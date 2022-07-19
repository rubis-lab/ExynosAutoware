inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The points_downsampler package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "points_downsampler"
ROS_BPN = "points_downsampler"

ROS_BUILD_DEPENDS = " \
	message-generation \
	autoware-config-msgs \
	pcl-conversions \
	pcl-ros \
	roscpp \
	sensor-msgs \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	message-runtime \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	message-generation \
	autoware-config-msgs \
	pcl-conversions \
	pcl-ros \
	roscpp \
	sensor-msgs \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	message-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	message-generation \
	autoware-config-msgs \
	pcl-conversions \
	pcl-ros \
	roscpp \
	sensor-msgs \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	message-runtime \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=points_downsampler"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "01d40155be9c7207813b317f674656e1d436ee55"
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