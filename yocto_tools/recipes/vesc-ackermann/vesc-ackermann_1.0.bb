inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The vesc_ackermann package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vesc_ackermann"
ROS_BPN = "vesc_ackermann"

ROS_BUILD_DEPENDS = " \
	nodelet \
	pluginlib \
	roscpp \
	nav-msgs \
	std-msgs \
	geometry-msgs \
	tf \
	ackermann-msgs \
	vesc-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	nodelet \
	pluginlib \
	roscpp \
	nav-msgs \
	std-msgs \
	geometry-msgs \
	tf \
	ackermann-msgs \
	vesc-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	nodelet \
	pluginlib \
	roscpp \
	nav-msgs \
	std-msgs \
	geometry-msgs \
	tf \
	ackermann-msgs \
	vesc-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=vesc_ackermann"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "6949a867ead1d202c8baabc3e6c9d7770dc80257"
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