inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The image_processor package"
AUTHOR = "Hayeon Park <kite9240@gmail.com>"
HOMEPAGE = "https://none"
SECTION = "devel"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "image_processor"
ROS_BPN = "image_processor"

ROS_BUILD_DEPENDS = " \
	cv-bridge \
	roscpp \
	sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
	catkin-native \
"

ROS_EXPORT_DEPENDS = " \
	cv-bridge \
	roscpp \
	sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
	cv-bridge \
	roscpp \
	sensor-msgs \
"

ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

ROS_BRANCH = "branch=image_processor"
SRC_URI = "git://github.com/rubis-lab/ExynosAutoware;${ROS_BRANCH};protocol=https"
SRCREV = "dc76e702f7027c2dc42e823c05606e2666b3cd57"
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