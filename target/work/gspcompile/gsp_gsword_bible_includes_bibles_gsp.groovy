import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gsword_bible_includes_bibles_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bible/includes/_bibles.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',9,['code':("searchbible")],-1)
printHtmlPart(2)
if(true && (book)) {
printHtmlPart(3)
expressionOut.print(book.name)
printHtmlPart(4)

int i=-1

printHtmlPart(5)
loop:{
int j = 0
for( bible in (bibles) ) {
printHtmlPart(6)

if (i<21){

printHtmlPart(7)

if (i==-1){

printHtmlPart(8)

}

printHtmlPart(9)
expressionOut.print(book.initials)
printHtmlPart(10)
expressionOut.print(bible.key)
printHtmlPart(11)
expressionOut.print(bible.shortname)
printHtmlPart(12)
expressionOut.print(bible.shortname)
printHtmlPart(13)

i++
                           }else {

                           i=0

printHtmlPart(14)
expressionOut.print(book.initials)
printHtmlPart(10)
expressionOut.print(bible.key)
printHtmlPart(11)
expressionOut.print(bible.shortname)
printHtmlPart(12)
expressionOut.print(bible.shortname)
printHtmlPart(15)

}

printHtmlPart(5)
j++
}
}
printHtmlPart(16)
}
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1401760946000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
