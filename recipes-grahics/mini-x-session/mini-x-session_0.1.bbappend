FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


SRC_URI += "file://session"


do_install_append() {

	mkdir -p  ${D}${sysconfdir}/mini_x/
	install -m 0755 ${S}/session ${D}${sysconfdir}/mini_x/
}
