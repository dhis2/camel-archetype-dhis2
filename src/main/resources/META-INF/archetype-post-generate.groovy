def rootDir = new File(request.getOutputDirectory() + "/" + request.getArtifactId())
def hawtioOption = request.getProperties().get("hawtio")
def openHimOption = request.getProperties().get("openHim")
def javaPackage = request.getProperties().get("package").replace(".", "/")

if (hawtioOption.equalsIgnoreCase("n")) {
    assert new File(rootDir, "src/test/java/" + javaPackage + "/HawtioWebConsoleFunctionalTestCase.java").delete()
}

if (openHimOption.equalsIgnoreCase("n")) {
    assert new File(rootDir, "src/main/resources/openhim").deleteDir()
    assert new File(rootDir, "src/main/java/" + javaPackage + "/route/OpenHimMediatorRouteBuilder.java").delete()
    assert new File(rootDir, "src/test/java/" + javaPackage + "/route/OpenHimMediatorRouteBuilderTestCase.java").delete()
    assert new File(rootDir, "src/main/java/" + javaPackage + "/security/SelfSignedHttpClientConfigurer.java").delete()
    assert new File(rootDir, "src/main/java/" + javaPackage + "/UptimeExpression.java").delete()
}