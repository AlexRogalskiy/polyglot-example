package ch.frankel.blog.polyglot

import com.vaadin.annotations.VaadinServletConfiguration
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import javax.servlet.annotation.WebInitParam
import javax.servlet.annotation.WebServlet

class MainUi: UI() {

    override fun init(request: VaadinRequest) {
        val label = Label("Hello from Polyglot Everywhere")
        val layout = VerticalLayout(label)
        layout.setMargin(true)
        layout.setSpacing(true)
        setContent(layout)
    }
}