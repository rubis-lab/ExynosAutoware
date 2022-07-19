inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rubis_logger package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "rubis_logger"
ROS_BPN = "rubis_logger"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	can-data-msgs \
	rubis-logger-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	can-data-msgs \
	rubis-logger-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	geometry-msgs \
	nav-msgs \
	roscpp \
	can-data-msgs \
	rubis-logger-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=rubis_logger"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "2eaedf0c5872a2b12b04b54cd85f64ba61de466a"
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