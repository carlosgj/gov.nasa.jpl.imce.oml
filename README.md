# Ontological Modeling Language (OML) Platform & Core Features

[![Build Status](https://travis-ci.org/JPL-IMCE/gov.nasa.jpl.imce.oml.svg?branch=master)](https://travis-ci.org/JPL-IMCE/gov.nasa.jpl.imce.oml)

Eclipse-based OML Workbench:  [ ![Download](https://api.bintray.com/packages/jpl-imce/gov.nasa.jpl.imce.oml/gov.nasa.jpl.imce.oml.product/images/download.svg) ](https://bintray.com/jpl-imce/gov.nasa.jpl.imce.oml/gov.nasa.jpl.imce.oml.product/_latestVersion)

OML is a specification language designed to support rigorous ontological modeling in the context of model-based systems engineering.
This multi-project is organized according to Eclipse Tycho guidelines.

## OML Workbench

The [OML Workbench](releng/gov.nasa.jpl.imce.oml.product/README.md) is an Eclipse-based RCP application.

## OML Development Process notes

- Make sure the Eclipse/Workspace "Text file encoding" is set to UTF-8

- Publish a new version:

	Execute `./scripts/publishProcess.sh`.
	
	This will prompt for a new version -- enter a string of the form `<major>.<minor>.<patch/build>`.
	This creates a version-specific release branch and tag.
	This also pushes the release branch and tag to origin, which should trigger the travis-ci job that will build the release and deploy it to bintray.
	
- Managing versions on bintray:

    OML is a collection of multiple packages, each with its own versioned artifacts; see: https://bintray.com/jpl-imce/gov.nasa.jpl.imce.oml
    To operate on all OML packages, see the utility: [scripts/btOMLProjectsDo.sh](scripts/btOMLProjectsDo.sh)
    
    Execute `./scripts/btOMLProjectsDo.sh` to get command-line usage information.
     
## GIT

Xtext compiles a grammar file, `*.xtext` into a corresponding binary in the `src-gen` folder as `*.xtextbin`.
If generated sources are in GIT:

- `git ls-files *.xtext | wc -l` should be equal to `git ls-files *.xtextbin | wc -l`
- `.gitignore` should no include a pattern matching `*.xtextbin`

## To set versions everywhere

Execute from the `gov.nasa.jpl.imce.oml.tycho` folder:

```shell
 mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion={VERSION} -Dtycho.mode=maven
```

where `{VERSION}` follows [semantic versioning](http://semver.org) (e.g., `Major.Minor.Patch` or `Major.Minor.Patch-SNAPSHOT`).

Note that this *should* update all versions in the following locations:

- `pom.xml//project/version`
- `pom.xml//project/parent/version`
- `META-INF/MANIFEST.MF//Bundle-Version`
- `feature.xml//feature/@version`
- `*.product//product/@version`
- `*.product//product/features/feature/@id`
- `category.xml//site/feature[@id=...]/@url`
- `category.xml//site/feature[@id=...]/@version`

Check carefully the log to make sure all versions have been properly updated.
Check with `git status` and/or `git diff` to confirm the changes.

## Deployment

TODO: Explore using maven profiles to decouple deployment info.

### Artifactory publishing

In `~/.m2/settings.xml` include, replacing `{ARTIFACTORY USERNAME}` and `{ARTIFACTORY APIKEY}` with appropriate credentials.

```
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd/"> 
  <servers>
    <server>
      <id>artifactory</id>
      <username>{ARTIFACTORY USERNAME}</username>
      <password>{ARTIFACTORY APIKEY}</password>
    </server>
  </servers>
</settings>
```

## Bintray publishing (currently disabled because some artifacts exceed the size limit on bintray)

In `~/.m2/settings.xml` include, replacing `{BINTRAY USERNAME}` and `{BINTRAY APIKEY}` with appropriate credentials.

```
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd/"> 
  <servers>
    <server>
      <id>bintray</id>
      <username>{BINTRAY USERNAME}</username>
      <password>{BINTRAY APIKEY}</password>
    </server>
  </servers>
</settings>
```

## Development Notes

### Using Windows 64-bit
In order to make sure your eclipse installation is running a particular version of Java, the eclipse configuration file must be edited.
The following must be added to 'eclipse.ini' located in your Eclipse installation folder before the line that contains '-vmargs':

```
-vm
PATH_TO_JAVA/bin
```
