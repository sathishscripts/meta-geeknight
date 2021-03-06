SUMMARY = "Qwt Oscilloscope Example"
DESCRIPTION = "Sample recipe for compiling qwt Oscilloscope example"

# LGPLv2.1 + some exceptions
LICENSE = "QWTv1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=dac2743472b0462ff3cfb4af42051c88"

SRC_URI = "file://osc.tar.gz; \
	file://run_osc.sh"

DEPENDS += " qwt-qt5"
RDEPEDNS += " libqwt-qt5"
PR = 'r5'

inherit qmake5

do_install_append() {
    # seems out of tree build confuses installation of examples
    # so install them manually
    install -d ${D}${bindir}/
    mkdir -p  ${D}${sysconfdir}/mini_x/apps/
    install -m 0755 ${S}/../run_osc.sh ${D}${sysconfdir}/mini_x/apps/run_osc.sh
    cp ${B}/oscilloscope ${D}${bindir}/
}
