import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dashboardd_jeevannindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/jeevann/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Cache-Control"),'content':("no-cache, no-store, must-revalidate")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Pragma"),'content':("no-cache")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Expires"),'content':("0")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',21,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("robots"),'content':("noindex, nofollow")],-1)
printHtmlPart(5)
invokeTag('captureMeta','sitemesh',31,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("patient")],-1)
printHtmlPart(6)
invokeTag('captureMeta','sitemesh',33,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',79,[:],1)
printHtmlPart(8)
createClosureForHtmlPart(9, 1)
invokeTag('captureBody','sitemesh',493,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1538720353000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
