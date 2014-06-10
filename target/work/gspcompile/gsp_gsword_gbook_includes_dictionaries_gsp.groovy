import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_gbook_includes_dictionaries_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/gbook/includes/_dictionaries.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
if(true && (book)) {
printHtmlPart(2)
expressionOut.print(book.name)
printHtmlPart(3)
}
printHtmlPart(4)

int i=-1

printHtmlPart(5)
loop:{
int j = 0
for( dictionary in (dictionaries) ) {
printHtmlPart(6)

if (i<5){

printHtmlPart(7)

if (i==-1){

printHtmlPart(8)

}

printHtmlPart(9)
expressionOut.print(dictionary.initials)
printHtmlPart(10)
expressionOut.print(dictionary.name)
printHtmlPart(11)
expressionOut.print(dictionary.name)
printHtmlPart(12)

i++
                           }else {

                           i=0

printHtmlPart(13)
expressionOut.print(dictionary.initials)
printHtmlPart(10)
expressionOut.print(dictionary.name)
printHtmlPart(11)
expressionOut.print(dictionary.name)
printHtmlPart(14)

}

printHtmlPart(5)
j++
}
}
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401760947000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
