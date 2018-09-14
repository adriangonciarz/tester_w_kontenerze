import os
import logging
import requests

logging.basicConfig(level=logging.DEBUG)
BASE_URI = os.environ.get("BASE_URI")
log = logging.getLogger()

def test_get_posts():
    log.debug('Using BASE_URI: %s' % BASE_URI)
    r = requests.get('%s/posts' % BASE_URI)
    assert r.status_code == 200, "Expected code 200 but got: %s" % r.status_code
