package ch.frankel.blog.polyglot

import ch.frankel.blog.polyglot.MainUi
import com.vaadin.annotations.VaadinServletConfiguration
import com.vaadin.server.VaadinServlet
import javax.servlet.annotation.WebInitParam
import javax.servlet.annotation.WebServlet

WebServlet (
    name = "VaadinServlet",
    urlPatterns = array("/*"),
    initParams = array(
        WebInitParam(
            name = "UI",
            value = "ch.frankel.blog.polyglot.MainUi"
        )
    )
)
VaadinServletConfiguration(
    productionMode = false,
    ui = javaClass<MainUi>()
)
class KotlinServlet: VaadinServlet()