build:
	gradle installDist

run-dist:
	./build/install/app/bin/app

build-and-run:
	make build && make run-dist

lint:
	gradle checkstyleMain

.PHONY: test, build