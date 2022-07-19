inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The points_preprocessor package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "points_preprocessor"
ROS_BPN = "points_preprocessor"

ROS_BUILD_DEPENDS = " \
	roslint \
	autoware-msgs \
	autoware-config-msgs \
	cv-bridge \
	message-filters \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rostest \
	sensor-msgs \
	std-msgs \
	tf \
	tf2 \
	tf2-ros \
	tf2-eigen \
	velodyne-pointcloud \
	yaml-cpp \
	rubis-lib \
	rubis-msgs \
	tf2-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	roslint \
	autoware-msgs \
	autoware-config-msgs \
	cv-bridge \
	message-filters \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rostest \
	sensor-msgs \
	std-msgs \
	tf \
	tf2 \
	tf2-ros \
	tf2-eigen \
	velodyne-pointcloud \
	yaml-cpp \
	rubis-lib \
	rubis-msgs \
	tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	roslint \
	autoware-msgs \
	autoware-config-msgs \
	cv-bridge \
	message-filters \
	pcl-conversions \
	pcl-ros \
	roscpp \
	rostest \
	sensor-msgs \
	std-msgs \
	tf \
	tf2 \
	tf2-ros \
	tf2-eigen \
	velodyne-pointcloud \
	yaml-cpp \
	rubis-lib \
	rubis-msgs \
	tf2-geometry-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=points_preprocessor"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "42cabab45cbd46f9419fc5d75454667878fbdf3b"
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