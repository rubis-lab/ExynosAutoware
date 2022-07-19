inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rubis_lib package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "rubis_lib"
ROS_BPN = "rubis_lib"

ROS_BUILD_DEPENDS = " \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	sensor-msgs \
	rubis-msgs \
	velodyne-pointcloud \
	tf \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	sensor-msgs \
	rubis-msgs \
	velodyne-pointcloud \
	tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	pcl-conversions \
	pcl-omp-registration \
	pcl-ros \
	sensor-msgs \
	rubis-msgs \
	velodyne-pointcloud \
	tf \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=rubis_lib"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "e6d2a1cf3d39805398493d6d0490f9df3bac806a"
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