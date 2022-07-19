inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rubis_autorunner package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "rubis_autorunner"
ROS_BPN = "rubis_autorunner"

ROS_BUILD_DEPENDS = " \
	autoware-msgs \
	roscpp \
	std-msgs \
	visualization-msgs \
	nmea-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	autoware-msgs \
	roscpp \
	std-msgs \
	visualization-msgs \
	nmea-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	autoware-msgs \
	roscpp \
	std-msgs \
	visualization-msgs \
	nmea-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=rubis_autorunner"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "67657b369f7adb545dffc1317f55ba507f7fefc3"
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