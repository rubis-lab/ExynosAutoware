inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The map_file package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "map_file"
ROS_BPN = "map_file"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	curl \
	geometry-msgs \
	pcl \
	pcl-ros \
	roscpp \
	std-msgs \
	tf2-geometry-msgs \
	tf2-ros \
	tf \
	vector-map \
	visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	curl \
	geometry-msgs \
	pcl \
	pcl-ros \
	roscpp \
	std-msgs \
	tf2-geometry-msgs \
	tf2-ros \
	tf \
	vector-map \
	visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	curl \
	geometry-msgs \
	pcl \
	pcl-ros \
	roscpp \
	std-msgs \
	tf2-geometry-msgs \
	tf2-ros \
	tf \
	vector-map \
	visualization-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=map_file"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "3c7c0418c9f8868ff202749690c5ef65da18e8e7"
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