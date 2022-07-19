inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The lidar_localizer package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=7d942f6573dba1c22962da3cdf66dbc0"

ROS_CN = "lidar_localizer"
ROS_BPN = "lidar_localizer"

ROS_BUILD_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	libeigen \
	pcl \
	message-filters \
	nav-msgs \
	ndt-cpu \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	libeigen \
	pcl \
	message-filters \
	nav-msgs \
	ndt-cpu \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	rostest \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-config-msgs \
	autoware-msgs \
	libeigen \
	pcl \
	message-filters \
	nav-msgs \
	ndt-cpu \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	roscpp \
	sensor-msgs \
	std-msgs \
	tf \
	velodyne-pointcloud \
	rubis-lib \
	rubis-msgs \
	rostest \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=lidar_localizer"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "4b4fa6e402d9e85946cb0bfa448b93301435a747"
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