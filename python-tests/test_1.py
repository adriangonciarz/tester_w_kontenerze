import os

import requests

BASE_URI = os.environ.get("BASE_URI")


def test_get_posts():
    r = requests.get('%s/posts' % BASE_URI)
    assert r.status_code == 200, "Expected code 200 but got: %s" % r.status_code
