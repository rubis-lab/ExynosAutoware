inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The autoware_connector package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "autoware_connector"
ROS_BPN = "autoware_connector"

ROS_BUILD_DEPENDS = " \
	autoware-can-msgs \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	std-msgs \
	rubis-lib \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-can-msgs \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	std-msgs \
	rubis-lib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-can-msgs \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	std-msgs \
	rubis-lib \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=autoware_connector"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "fbc0dca8b665bf81145d6a9844b7e69468cdc3c6"
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