inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The lidar_euclidean_cluster_detect package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "lidar_euclidean_cluster_detect"
ROS_BPN = "lidar_euclidean_cluster_detect"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	grid-map-cv \
	grid-map-msgs \
	grid-map-ros \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	vector-map-server \
	rubis-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	grid-map-cv \
	grid-map-msgs \
	grid-map-ros \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	vector-map-server \
	rubis-lib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	grid-map-cv \
	grid-map-msgs \
	grid-map-ros \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	vector-map-server \
	rubis-lib \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=lidar_euclidean_cluster_detect"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "0992dcaf71ff859100e21b9712a332b961be70c4"
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