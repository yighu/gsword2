<html>
<head>
    <title><g:layoutTitle default="GSword" /></title>
    <meta name="description" value="GSword Online Bible Studio Chinese ccim Christian God His Word what does Bible say pray spiritual religion ${metadesc?:''}"/>
    <link type="text/css" href="/gsword/jm/menu.css" rel="stylesheet" />
    <link type="text/css" href="/gsword/css/pagination.css" rel="stylesheet" />
    <link type="text/css" href="/gsword/css/iBD.css" rel="stylesheet" />
    <link type="text/css" href="/gsword/css/jquery.mobile-1.1.0.min.css" rel="stylesheet" />

    <script type="text/javascript" src="/gsword/jm/jquery.js"></script>
    <script type="text/javascript" src="/gsword/jm/menu.js"></script>
<r:layoutResources/>
</head>
<body>
<style type="text/css">
* { margin:0;
    padding:0;
}
xbody { background:#272727; }
div#menu {
    margin:10px auto;
    width:100%;
}
div#copyright {
    margin:0 auto;
    width:0%;
    font:0px 'Trebuchet MS';
    color:#124a6f;
    text-indent:20px;
    padding:00px 0 0 0;
}
div#copyright a { color:#4682b4; }
div#copyright a:hover { color:#124a6f; }
</style>

<div id="menu"> 
    <ul class="menu">
        <li><a href="/gsword"><span><g:message code="home"/></span></a> </li> 
        <li><a href="#" class="parent"><span>
                   <g:message code="bible"/> 
</span></a>
                    <div> 
                        <ul> 
                            <li> 
    <a href="/gsword/bible/read"><span><g:message code="readbible"/></span></a> 
</li> 
                            <li> <a href="/gsword/bible/search"><span><g:message code="searchthebible"/></span></a> </li> 
<li><a href="/gsword/bible/cmnt"><span><g:message code="commentary"/></span></a> </li> 
<li><a href="/gsword/gbook/c"><span><g:message code="classics"/></span></a> </li> 
<li><a href="/gsword/ex"><span><g:message code="general"/></span></a> </li> 
<li><a href="/gsword/gbook/searchdics"><span><g:message code="dictionarylookup"/></span></a> </li> 
                        </ul> 
                    </div> 
            </li> 
        
        <!--li><a href="#" class="parent"><span>
                   <g:message code="translate"/> 
</span></a>
                    <div> 
                        <ul> 
<li><a href="/gsword/translate"><span><g:message code="translate"/></span></a> </li> 
                        </ul> 
                    </div> 
            </li--> 
            <li class="parent"> 
                <a href="#"> 
<span> 
                   <g:message code="feed"/> 
</span> 
                </a> 
                    <div> 
                        <ul> 
<li><a href="/gsword/gbook/oneyearbible"><span><g:message code="oneyearbible"/></span></a> </li> 
<li><a href="/gsword/gbook/dailydevotions"><span><g:message code="dailyfood"/></span></a> </li> 
<!--li><a href="/gsword/gbook/feeds"><span><g:message code="meditate"/></span></a> </li--> 
<li><a href="/gsword/prayer"><span><g:message code="prayer"/></span></a> </li> 
<li><a href="/gsword/closet/index.htm"><span><g:message code="closet"/></span></a> </li> 
<li><a href="/gsword/incloset"><span><g:message code="closet"/></span></a> </li> 
<li><a href="/gsword/gbook/vp/${Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
}"><span><g:message code="readpray"/></span></a> </li> 
                        </ul> 
                    </div> 
 
            </li> 
        
<!--li><a href="/gsword/gbook/v"><span><g:message code="gsword"/></span></a> </li--> 
	<li><a href="javascript:takenote();"> <span><g:message code="takenote"/></span> </a></li>
<li><a href="/gsword/gbook/about"><span><g:message code="about"/></span></a> </li> 
<li><a href="http://bible.ccim.org"><span><g:message code="oldtool"/></span></a> </li> 
            <li class="parent"> 
 
                <a href="#"> 
<span>
                    <g:message code="changelanguage"/>
</span>
                </a> 
 
                    <div > 
                        <ul> 
<li><a href="/gsword/gbook/language_change?lang=zh_CN"><span><g:message code="locale.language.zh"/></span></a> </li> 
<li><a href="/gsword/gbook/language_change?lang=en_US"><span><g:message code="locale.language.en"/></span></a> </li> 
                        </ul> 
                </div> 
            </li> 
    </ul>
</div> 
    <div style="padding: 0px 00px">
        <g:layoutBody />
      <r:layoutResources/>
    </div>

    <div style="padding: 0px 00px">
<br/>
<br/>
	<button onclick="takenote();"><span><g:message code="takenote"/></span> </button><br/>
	<div id="noteform" name="noteform></div>
<br/>
<br/>
<br/>
<br/>
<h1>----------------------------------------</h1>
    </div>
<div id="copyright"><a href="http://apycom.com/"></a></div>
<!--div id="copyright">Copyright &copy; 2010 <a href="http://apycom.com/">Apycom jQuery Menus</a></div-->
<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
try {
var pageTracker = _gat._getTracker("UA-8971382-3");
pageTracker._trackPageview();
} catch(err) {}</script>
</body>
</html>
