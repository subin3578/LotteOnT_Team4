/*<![CDATA[*/
(function(w) {
    var wg = w.document.getElementById('wp_tg_cts');
    function doPair(url) {
        if (wg == null) { return; }
        (function(_url) {
            var frm = w.document.createElement('IFRAME');
            frm.width = '1px';
            frm.height = '1px';
            frm.style.display = 'none';
            frm.src='about:blank';
            frm.title = 'tgpairing';
            wg.appendChild(frm);

            var ifrm = (frm.contentWindow) ? frm.contentWindow : (frm.contentDocument.document ? frm.contentDocument.document : frm.contentDocument);
            ifrm.document.open();
            ifrm.document.write('<img src=\"' + _url + '\"/>');
            ifrm.document.close();

            setTimeout(function() {
                wg.removeChild(frm);
            }, 2000);
        })(url);
    }

    try {
        var links = ["https:\/\/cm.g.doubleclick.net\/pixel?google_nid=wider_planet\u0026google_cm\u0026google_ula=12153253,1728887981\u0026poaid=27d2d5add7b488238d3cae97fad05626"],
            len = links.length,
            i;
        for (i=0; i<len; i++) {
            doPair(links[i]);
        }
    } catch(e) {}
})(window);
/*]]>*/


/*<![CDATA[*/
(function() {
var ttd = new Image();
ttd.src = "https:\/\/match.adsrvr.org\/track\/cmf\/generic?ttd_pid=ven6wdk\u0026ttd_tpi=1\u0026ttd_puid=27d2d5add7b488238d3cae97fad05626";
})();
/*]]>*/





/*<![CDATA[*/
(function(w) {
    var origin = "https:\/\/astg.widerplanet.com";
    var wg = w.document.getElementById('wp_tg_cts');
    function doPair(url) {
        if (wg == null) { return; }
        (function(_url) {
            var frm = w.document.createElement('IFRAME');
            frm.width = '1px';
            frm.height = '1px';
            frm.style.display = 'none';
            frm.src= _url;
            frm.title = 'tgpairing';
            frm.addEventListener('load', function(o) {
                try {
                    frm.contentWindow.postMessage({}, origin);
                } catch(e) {}
            });

            wg.appendChild(frm);
            setTimeout(function() {
                wg.removeChild(frm);
            }, 3000);
        })(url);
    }

    try {
        doPair("https:\/\/astg.widerplanet.com\/delivery\/storage?request_id=null\u0026wp_uid=2-27d2d5add7b488238d3cae97fad05626-s1728291045.555488%7Cwindows_10%7Cedge-1dywbfy\u0026qsc=1fxxqw2");
    } catch(e) {}
})(window);
/*]]>*/




